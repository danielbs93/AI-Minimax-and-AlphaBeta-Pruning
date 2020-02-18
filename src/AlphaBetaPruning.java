import java.util.List;

public class AlphaBetaPruning implements ISolver {
    @Override
    public String getSolverName() {
        return "Alpha-Beta Pruning";
    }

    @Override
    public double solve(IBoard board) {
        Node root = new Node(board, Node.NodeType.MAX);
        return AlphaBetaPruningAlgorithm(root, -Double.MAX_VALUE, Double.MAX_VALUE);
    }


    private double AlphaBetaPruningAlgorithm(Node node, double p_alpha, double p_beta) {
        if (node.isTerminalNode())
            return node.getScore();
        List<Node> children = node.getNodeChildren();
        if (node.getNodeType() == Node.NodeType.MAX) {
            while (children.size() > 0) {
                Node current = children.remove(0);
                if (p_alpha < p_beta) {
                    double temp = AlphaBetaPruningAlgorithm(current, p_alpha, p_beta);
                    if (temp > p_alpha)
                        p_alpha = temp;
                }
            }
            return p_alpha;
        } else {
            while (children.size() > 0) {
                Node current = children.remove(0);
                if (p_beta > p_alpha) {
                    double temp = AlphaBetaPruningAlgorithm(current, p_alpha, p_beta);
                    if (temp < p_beta)
                        p_beta = temp;
                }
            }
        }
        return p_beta;
    }
}

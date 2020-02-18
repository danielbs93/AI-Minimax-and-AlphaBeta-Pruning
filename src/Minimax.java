import java.util.List;

public class Minimax implements ISolver {
    @Override
    public String getSolverName() {
        return "Minimax";
    }

    @Override
    public double solve(IBoard board) {
        Node root = new Node(board, Node.NodeType.MAX);
        return MinimaxAlgorithm(root);
    }

    private double MinimaxAlgorithm(Node node) {
        List<Node> children = node.getNodeChildren();
        if ((children.size()>0)) {
            double minMax = MinimaxAlgorithm(children.remove(0));
            while (children.size() > 0) {
                if (node.getNodeType() == Node.NodeType.MAX) {
                    double temp = MinimaxAlgorithm(children.remove(0));
                    if (temp > minMax)
                        minMax = temp;
                } else {
                    double temp = MinimaxAlgorithm(children.remove(0));
                    if (temp < minMax)
                        minMax = temp;
                }
            }
            return minMax;
        }
        return node.getScore();
    }
//    private double MinimaxAlgorithm(Node node) {
//        List<Node> children = node.getNodeChildren();
//        if (children.size() > 0) {
//            int i = 0;
//            Double[] array = new Double[children.size()];
//            for (Node child : children) {
//                array[i] = MinimaxAlgorithm(child);
//                i++;
//            }
//            double minmax = array[0];
//            if (node.getNodeType() == Node.NodeType.MAX) {
//                    for (int j = 1; j < array.length; j++) {
//                        if (array[j] > minmax)
//                            minmax = array[j];
//                    }
//                } else {
//                    for (int j = 1; j < array.length; j++) {
//                        if (array[j] < minmax)
//                            minmax = array[j];
//                    }
//                }
//
//            return minmax;
//        }
//        return node.getScore();
//    }
}


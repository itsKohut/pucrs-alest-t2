public class Main {

    public static void main(String[] args) {

//        TXTFileChooser txtChooser = new TXTFileChooser();
//        String filePath = txtChooser.getPath();
//        String fileName = filePath.substring(8);
//        System.out.print("\nSELECTED: " + fileName);

        Graph graph = new Graph(9);

        Castle zero = new Castle(0,144);
        Castle one = new Castle(1,79);
        Castle two = new Castle(2,69);
        Castle three = new Castle(3,82);
        Castle four = new Castle(4,49);
        Castle five = new Castle(5,11);
        Castle six = new Castle(6,25);
        Castle seven = new Castle(7,84);
        Castle eigth = new Castle(8,35);

        graph.castle.put(0, zero);
        graph.castle.put(1, one);
        graph.castle.put(2, two );
        graph.castle.put(3, three);
        graph.castle.put(4, four);
        graph.castle.put(5, five);
        graph.castle.put(6, six);
        graph.castle.put(7, seven);
        graph.castle.put(8, eigth);


        graph.addEdge(zero,five);
        graph.addEdge(zero, six);
        graph.addEdge(zero, eigth);
        graph.addEdge(zero, one);
        graph.addEdge(zero, two);
        graph.addEdge(zero, three);
        graph.addEdge(one, four);
        graph.addEdge(one, seven);
        graph.addEdge(one,eigth);
        graph.addEdge(one,three);
        graph.addEdge(two,five);
        graph.addEdge(two, six);
        graph.addEdge(two, seven);
        graph.addEdge(two, three);
        graph.addEdge(three, four);
        graph.addEdge(three, five);
        graph.addEdge(three, six);
        graph.addEdge(three, seven);
        graph.addEdge(three, eigth);


        System.out.print(graph.conquered());
    }
}


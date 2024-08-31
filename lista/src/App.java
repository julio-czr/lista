public class App {
    public static void main(String[] args) {
        List list = new List(5);

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list.getFill());

        list.add(25, 1); 
        System.out.println(list.getData(1)); 

        System.out.println("cheia? " + list.isFull());

        list.add(40);
        list.add(50);

        System.out.println("cheia? " + list.isFull());

        // Tentando adicionar em lista cheia
        list.add(60); 

        System.out.println(list.remove(2));

        System.out.println(list.find(30));

        list.setData(99, 1); 
        System.out.println( list.getData(1)); 

        // Limpando lista
        list.clear();
        System.out.println(list.getFill()); 
        System.out.println("vazia? " + list.isEmpty()); 
    }
}

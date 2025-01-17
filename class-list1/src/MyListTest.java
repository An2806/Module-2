public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> litsIneger = new MyList<Integer>();
        litsIneger.add(1);
        litsIneger.add(2);
        litsIneger.add(3);
        litsIneger.add(4);
        litsIneger.add(5);


        System.out.println("element 4 : " + litsIneger.get(4));
        System.out.println("element 1 : " + litsIneger.get(1));
        System.out.println("element 2 : " + litsIneger.get(2));

//        litsIneger.get(6);
//        System.out.println("element 6 : " + litsIneger.get(6));

        litsIneger.get(-1);
        System.out.println("element -1 : " + litsIneger.get(-1));
    }
}
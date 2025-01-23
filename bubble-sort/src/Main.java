public class Main {
    public static void main(String[] args) {
        int[] list= BubbleSort.list;
        BubbleSort.bubbleSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}

package local.onlits.onlits2001.despat.strategy;

public class Client {
    private int[] list = {10, 2, 51, 99, 73, 15, 26, 34, 66, 81};
    public static void main(String[] args) {
        // var s = new SelectionSort();
        // Sort c = new Sort();
        // c.list = s.sort(c.list);
        System.out.println("The sorted list is:");
        // c.display();
    }

    void display()
    {
        for (int i : list) {
            System.out.println(i);
        }
    }
}

package local.onlits.onlits2001.despat.strategy;

public class BubbleSort implements ISortStrategy {
    public int[] sort(int[] list) {
        for(int i = 0; i<list.length-1; i++) {
            for(int j=0; j<list.length-1; j++)
            {
                if(list[j]>list[j+1]) {
                    int t = list[j];
                    list[j] = list[j+1];
                    list[j+1] = t;
                }
            }
        }
        return list;
    }
}

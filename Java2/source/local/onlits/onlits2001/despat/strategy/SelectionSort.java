package local.onlits.onlits2001.despat.strategy;

public class SelectionSort implements ISortStrategy {
    public int[] sort(int[] list) {
        for(int i = 0; i<list.length-1; i++) {
            for(int j=i+1; j<list.length; j++)
            {
                if(list[i]>list[j]) {
                    int t = list[i];
                    list[i] = list[j];
                    list[j] = t;
                }
            }
        }
        return list;
    }
    
}

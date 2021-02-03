package back_to_java_coder;


public class main7_sort {

	//
	public static void func14_sort_int_shower(int a[]) {
        int size = a.length;
        for(int i=size-1; i>0; i--) {
        	System.out.printf("\n%d차 정렬 : ", size-i);
            for(int j=0; j<i; j++) {
                if(a[j] > a[j+1]) {
                	func14_1_swap(a,j,j+1);
                }
                System.out.printf("\n\t");
                for(int v : a) {
                	System.out.printf("%3d ", v);
                }
            }            
        }
        System.out.println();
    }
	
	public static int[] func14_sort_int_blind(int a[]) {
        int size = a.length;
        for(int i=size-1; i>0; i--) {
            for(int j=0; j<i; j++) {
                if(a[j] > a[j+1])func14_1_swap(a,j,j+1);
            }            
        }
        return a;
    }

	public static void func14_1_swap(int a[], int idx1, int idx2) {
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }  




	public static void main(String[] args) {
		System.out.println("main7 sort started!");
		System.out.println("영어문자를 몇개 입력하시겠습니까?");
		int userans2 = 0;
		userans2 = main3_simples.func8_only_num(userans2, "userans2");
		String[] idx2 = new String[userans2];
		for (int i = 0; i < idx2.length; i++) {
			idx2[i] = main3_simples.func8_only_eng(idx2[i], "idx["+i+"]");
		}
		
		
		
		
		
		
		System.out.println("숫자를 몇개 입력하시겠습니까?");
		int userans1 = 0;
		userans1 = main3_simples.func8_only_num(userans1, "userans"+1);
		
		int[] idx = new int[userans1];
		for (int i = 0; i < userans1; i++) {
			idx[i] = main3_simples.func8_only_num(idx[i], "idx["+i+"]");
			//System.out.println("idx["+i+"] = " + idx[i]);
		}
		System.out.println("\n===\n");
		//func14_sort_int_shower(idx);
		idx = func14_sort_int_blind(idx);
		for (int i = 0; i < idx.length; i++) {
			System.out.println("idx["+i+"] = " + idx[i]);
		}
		
	}

}

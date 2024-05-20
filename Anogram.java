import java.util.ArrayList;

class Anogram{
	public static boolean ano(String s1,String s2){
		int c1;
		int c2;
		// int c1=0;
		if (s1.length()==s2.length()){
			c1=0;
			c2=0;
			char[] ca1=s1.toCharArray();
			// char[] c2=s2.toCharArray();
			// int[][] arr=new int[s1.length][2];
			// int i=0;
			for (char ch:ca1){
				for(int i=0;i<s1.length();i++){
					if (ch==s1.charAt(i))
						c1++;
					if (ch==s2.charAt(i))
						c2++;
				}
				if (c1!=c2)
					return false;
			}
		}
		else{
			return false;
		}
		return true;
	}
	public static void main(String[] args){
		String[] list= {"nat","eat","tea","bat","tan","ate"};
		ArrayList<ArrayList<String>> arrayList2D = new ArrayList<>();
		ArrayList<String> row1;
		// int i=0;
		// for (int i=0;i<list.length;i++){
			// if (!list[i].equals("null")){
				// row1 = new ArrayList<>();
				// row1.add(list[i]);
				// for (int j=0;j<list.length;j++){
					// if(!list[j].equals("null")){
						// if (ano(list[i],list[j])){
							// row1.add(0,list[j]);
							// list[j]="null";
						// }
					// }
				// }
				// arrayList2D.add(row1);
			// }
		// }
		for (String w:list){
			if (!w.equals("null")){
				row1 = new ArrayList<>();
				row1.add(w);
				for (int j=0;j<list.length;j++){
					if(!list[j].equals("null")){
						if (ano(w,list[j])){
							row1.add(0,list[j]);
							list[j]="null";
						}
					}
				}
				arrayList2D.add(row1);
			}
		}
		System.out.println("Elements of the 2D ArrayList:");
        for (ArrayList<String> row : arrayList2D) {
            System.out.println(row);
        }
		
		
		// boolean b= ano("arun","nuaa");
		// System.out.println(b);
	}
}
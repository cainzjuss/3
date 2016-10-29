import java.util.*;
public class Kolm{
	public static void main(String[] arg){
		Kaks s1=new Kaks(10,3);
		System.out.println(s1.hüpotenuus());
		List<Üks> kujundid=new ArrayList<Üks>();
		kujundid.add(s1);
		//kujundid.add(new Risttahukas(3,4,5));
		for(Üks k: kujundid){
			System.out.println(k.hüpotenuus());
		}
	}
}
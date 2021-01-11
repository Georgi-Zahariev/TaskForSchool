
public class SortedAssoTriple<T> {
	private class Elements{
		private T value;
		private String name;
		public Elements(String n, T v) {
			name = n;
			value  = v;
		}
		public T getValue() {
			return value;
		}
		public void setValue(T v) {
			value = v;
		}
		public String getName() {
			return name;
		}
		public void setName(String n) {
			name = n;
		}
		
	}
	Elements el1,el2,el3;
	
	public SortedAssoTriple( String name1, T val1, String name2, T val2 , String name3, T val3)  throws NullPointerException{
		if( name1==name2|| name1==name3 || name2==name3) throw new NullPointerException();
		el1= new Elements(name1,val1); 
		el2= new Elements(name2,val2); 
		el3= new Elements(name3,val3); 
		Alphabetical();
	}
	public boolean isBefore(String n1, String n2) {
		for( int i = 0 ; i<n1.length(); i++) {
			if(n1.charAt(i) > n2.charAt(i)) return true;
			else if( n1.charAt(i) < n2.charAt(i) ) return false;
		}
			return false;
	}
	public void Alphabetical() {
		T val1= el1.getValue();
		T val2= el2.getValue();
		T val3= el3.getValue();
		T vals;
		String name1 = el1.getName();
		String name2 = el2.getName();
		String name3 = el3.getName();
		String names;
		
		if( !isBefore( name1,name2)){
			names = name1;
			name1= name2;
			name2= names;
			vals= val1;
			val1=val2;
			val2 =vals;
		}
		if( !isBefore( name2,name3)){
			names = name2;
			name2= name3;
			name3= names;
			vals= val2;
			val2=val3;
			val3 =vals;
		}
		if( !isBefore( name1,name2)){
			names = name1;
			name1= name2;
			name2= names;
			vals= val1;
			val1=val2;
			val2 =vals;
		}
	}
	
	public void setName(String searchedn , String newn ) throws NullPointerException{
		if( !searchedn.equals(el1.getName()) && !searchedn.equals(el2.getName())&& !searchedn.equals(el3.getName())) throw new NullPointerException();
		if( el1.getName().equals(searchedn)) {
			el1.setName(newn);}
		else if( el2.getName().equals(searchedn)) {
			el2.setName(newn);}
		else {
			el3.setName(newn);}
		}

	public void setName( int searchedn , String newn ) throws NullPointerException{
		if( searchedn < 0 || searchedn> 2 ) throw new NullPointerException();
		if( searchedn == 0) {
			el1.setName(newn);}
		else if( searchedn==1) {
			el2.setName(newn);}
		else {
			el3.setName(newn);}
		}
	
	public String toString() {
		return "[" + el1.getName() +": "+ el1.getValue() + " ; " + el2.getName() +": "+ el2.getValue() + " ; "+ el3.getName() +": "+ el3.getValue() +  "]";
	}

}

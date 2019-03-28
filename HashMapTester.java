public class HashMapTester{
	
	public static void main(String[] args){
		HashMap hash = new HashMap();
		hash.put(1,10);
		
		hash.put(11,0);
		hash.put(27,30);
		hash.put(12,40);
		hash.put(34,50);
		hash.put(51,60);
		hash.put(61,70);
		hash.put(81,0);
		hash.put(91,30);
		hash.put(2,40);
		hash.put(3,50);
		hash.put(4,60);
		hash.put(5,70);
		System.out.println(hash.toString());
	}			
}
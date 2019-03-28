public class ChainList{
			
	private int key;
	private int value;
	private ChainList next; 

	public ChainList(int key,int value){
		this.key = key;
		this.value = value;
		this.next = null;

	}
	public int getKey(){

		return this.key;
	}
	public int getValue(){

		return this.value;
	}	
	public ChainList getNext(){

		return this.next;
	}
	//Setters
	public void setKey(int key){

		this.key = key;
	}
	public void setValue(int value){

		this.value = value;
	}
	public void setNext(ChainList next){

		this.next = next;
	}
	public String toString(){

		return "{"+this.key+","+this.value+"}";
	}
			
}
public class HashMap{
	/*
	Always a prime number as a size for the hash_table
	to reduce the collision.
	*/
	private final static int HASH_SIZE = 7;
	private ChainList[] table;

	public HashMap(){
		table = new ChainList [HASH_SIZE];
		for(int i= 0 ; i < table.length; i++){
			table[i] = null;
		}
	}
	public int hashFunction(int key){

		return (key%HASH_SIZE );
	} 
	public int getElement(int key){

		int index = hashFunction(key);
		if(this.table[index] == null){
			System.out.println("There isn't any element with that key!");
			return -1;
		}
		else {

          	ChainList entry = table[index];

          	while (entry != null && entry.getKey() != key){

                entry = entry.getNext();
            }	
          	if (entry == null){

                return -1;
            }    	
          	else{
          		System.out.println("I found an element with key: "+key+" and value: "+entry.getValue());	
            	return entry.getValue();
         	}

    	}	

	}
	public void put(int key,int value){

		int index = hashFunction(key);
		if(table[index] == null){
			System.out.println("Adding new element into the Hash-Table");
			table[index] = new ChainList(key,value);

		}
		else {
			
			ChainList entry = table[index];

          	while (entry.getNext() != null && entry.getKey() != key){

            	entry = entry.getNext();
            }    	
          	if (entry.getKey() == key){

                entry.setValue(value);
            }    	
          	else{
          		//Adding to the list because of the collision	
                entry.setNext(new ChainList(key, value));
			}
			
		}
	}
	public String toString(){
		String s="";	
		for(int i=0;i<HASH_SIZE;i++){
			if(table[i] != null){
				System.out.println("inex : "+i);
				s+="["+table[i].toString()+"]";
				
				if(table[i].getNext() != null){
					System.out.println("mpika");
					ChainList entry = table[i].getNext();		
					while(entry != null ){
						s+="-->"+entry.toString();
						entry = entry.getNext();
					} 

				}
				s+="\n";
			}

			
		}
		return s;
	}

}
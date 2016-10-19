abstract class Persistence{
	abstract void persist();

}
class PersistenceFactory{
		public static Persistence getPersistence(){
		Persistence p=new FilePersistence();
		Persistence p=new DatabasePersistence();
		return p;
	}
}
class FilePersistence extends Persistence{
	public void persist(){
		System.out.println("File Persistence");
	}
}

class DatabasePersistence extends Persistence{
	public void persist(){
		System.out.println("DB Persistence");
	}
}

class Client{
	public static void main(String args[]){
	Persistence p=PersistenceFactory.getPersistence();
	p.persist();
	}
}

public class Character {
	String name;
	int health;
	int exp;
	int level;
	
	public Character(){
		// Default Constructor
	}
	
	public Character(String name, int health, int exp, int level){
		this.name=name;
		this.health=health;
		this.exp=exp;
		this.level=level;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getHealth(){
		return this.health;
	}	
	
	public int getExp(){
		return this.exp;
	}
	
	public int getLevel(){
		return this.level;
	}	
	
	@Override
	public String toString(){
		String s="\r\n";
		s+="****************************************\r\n";
		s+="*                                      *\r\n";
		int nameLength=this.name.length();
		// Name
		s+="*";
		for(int i=0;i<20 - nameLength/2-1;i++){
			s+=" ";
		}
		s+=this.name;
		for(int i=0;i<20 - nameLength/2-1;i++){
			s+=" ";
		}
		s+="*\r\n";
		// Health
		s+="* Health : " + Integer.toString(this.health);
		for(int i=0;i<28 - Integer.toString(this.health).length();i++){
			s+=" ";
		}
		s+="*\r\n";
		// Experience
		s+="* Experience : " + Integer.toString(this.exp);
		for(int i=0;i<24 - Integer.toString(this.exp).length();i++){
			s+=" ";
		}
		s+="*\r\n";
		
		// Level
		s+="* Level : " + Integer.toString(this.level);
		for(int i=0;i<29 - Integer.toString(this.level).length();i++){
			s+=" ";
		}
		s+="*\r\n";
		
		s+="*                                      *\r\n";
		s+="****************************************\r\n";
		return s;
	}
	
	
}

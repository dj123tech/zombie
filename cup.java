public class cup {
    String ndice;
    String type;
    
    cup(){
        
        
        
    }
    
public static dice[] grab() {
	double random = Math.random()*12+1;
	double random2 = Math.random()*12+1;
	double random3 = Math.random()*12+1;
	
	dice [] die = new dice[14];
    for (int i = 0; i <=6; i++){die[i] = new dice("green");}
    for (int j = 7; j<=10; j++) {die[j] = new dice("yellow");}
    for (int e = 11; e<=13; e++) {die[e] = new dice("red");}
	
    int x = (int) random;
	int y = (int) random2;
	int z = (int) random3;
	
	dice d = die[x];
	dice f = die[y];
	dice g = die[z];
	
	dice[] used = new dice[2];
	used[0] = d;
	used[1] = f;
	used[2] = g;
	return used;
	
	//String one = d.getColor(), two = f.getColor(), three = g.getColor();
	//String four = one + ", " + two + ", " + three;
	//return four;
	 
	 
	

}
    
    String getNdice() {return ndice;}
    String getType() {return type;}
    void setNdice(String n) {ndice = n;}
    void setType(String t) {type = t;}
}


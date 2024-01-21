/*** When you are done, this program will draw an ice cream cone with 
     scoops of ice cream, sprinkles, and a cherry on top.
***/
import javax.swing.JOptionPane;
void setup(){

     size(500,500);
  
    
makeIceCreamCone();
     
String one = JOptionPane.showInputDialog("What icecream flavor do you wan't on your first layer? (Chocolate, Vanilla, or Strawberry)");
if(one.equals("Strawberry")){
addScoop("Strawberry");
scoops += 1;
}
if(one.equals("Chocolate")){
addScoop("Chocolate");
scoops += 1;
}
if(one.equals("Vanilla")){
addScoop("Vanilla");
scoops += 1;
} //<>//
String two = JOptionPane.showInputDialog("What icecream flavor do you wan't on your second layer? (Chocolate, Vanilla, or Strawberry)");
if(two.equals("Strawberry")){
addScoop("Strawberry");
}
if(two.equals("Chocolate")){
addScoop("Chocolate");
}
if(two.equals("Vanilla")){
addScoop("Vanilla");
}
String sprinkle = JOptionPane.showInputDialog("do you want Sprinkles, Yes or No?");
if(sprinkle.equals("Yes")){
String sprinkleCount = JOptionPane.showInputDialog("A lot, A little, or Normal");
  if (sprinkleCount.equals("A lot")){
  addSprinkle(500);
  }
  if (sprinkleCount.equals("A little")){
  addSprinkle(10);
  }
  if (sprinkleCount.equals("Normal")){
  addSprinkle(50);
  }
  if (sprinkleCount.equals("Too much")){
  addSprinkle(50000);
  }
}

String cherry= JOptionPane.showInputDialog("Do you want a cherry too, Yes or No?");
if(cherry.equals("Yes")){
  fill(255,0,0);
  ellipse(50,50,50,51);
}
     

}

//***************|-|***************\\

//Icecream recipe
int SCOOPSIZE = 150;
int scoops = 0;
int coneY = 320;


void makeIceCreamCone(){
     noStroke();
     fill(188,126,49);
     triangle(190,320,310,300,255,500);
}


void addScoop(String flavor){
     noStroke();
     if(flavor.equalsIgnoreCase("Chocolate")){
         fill(116,71,16);
     }
     else if(flavor.equalsIgnoreCase("Strawberry")){
         fill( 232 ,144,129);
     }
     else if(flavor.equalsIgnoreCase("Vanilla")){
         fill(245, 243, 227);
     } else{
         println("ERROR: We don't have the flavor "+ flavor); 
         return;
     }
     ellipse(width/2,coneY - 50 - (SCOOPSIZE*scoops)/2,SCOOPSIZE,SCOOPSIZE);
     scoops++;
}


void addSprinkle(int numberOfSprinkles){
    for(int i = 0; i < numberOfSprinkles; i++){
         fill(random(256),random(256),random(256));
         int minX = width/2-SCOOPSIZE/2 + 10;
         int maxX = SCOOPSIZE/3 +width/2 +10;
         int minY = coneY-((SCOOPSIZE)*scoops)/2+30;
         int maxY = coneY;
         int sprinkleAreaX = (int)random(minX, maxX);
         int sprinkleAreaY = (int)random(minY, maxY);
         int sprinkleWidth = (int)random(2,9);
         int sprinkleHeight = (int)random(2,9);
         ellipse(sprinkleAreaX,sprinkleAreaY,sprinkleHeight,sprinkleWidth);
     }
}

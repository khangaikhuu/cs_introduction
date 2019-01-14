/*    */ import greenfoot.Actor;
/*    */ import greenfoot.GreenfootImage;
/*    */ 
/*    */ public class Labels extends Actor
/*    */ {
/*    */   public Labels(String label)
/*    */   {
/* 12 */     GreenfootImage Label = new GreenfootImage(20 * label.length(), 10);
/* 13 */     Label.drawString(label, 10, 10);
/* 14 */     setImage(Label);
/*    */   }
/*    */ }

/* Location:           C:\Users\Johann\Desktop\Neuer Ordner (2)\
 * Qualified Name:     Labels
 * JD-Core Version:    0.6.2
 */
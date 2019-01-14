/*    */ import greenfoot.Actor;
/*    */ import greenfoot.GreenfootImage;
/*    */ 
/*    */ public class TextField extends Actor
/*    */ {
/*    */   public TextField(String text)
/*    */   {
/* 12 */     GreenfootImage TextBox = new GreenfootImage(20 * text.length(), 20);
/* 13 */     TextBox.drawString(text, 2, 20);
/* 14 */     setImage(TextBox);
/*    */   }
/*    */ }

/* Location:           C:\Users\Johann\Desktop\Neuer Ordner (2)\
 * Qualified Name:     TextField
 * JD-Core Version:    0.6.2
 */
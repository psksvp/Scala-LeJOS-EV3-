package psksvp

import lejos.hardware.BrickFinder
import lejos.hardware.ev3.EV3

object HelloWorld extends App 
{
  val ev3  = BrickFinder.getLocal.asInstanceOf[EV3]
  val lcd  = ev3.getTextLCD
  val keys = ev3.getKeys
  lcd.drawString("Hello World", 4, 3)
  lcd.drawString("I'm a Scala app", 1, 4)
  
  val audio = ev3.getAudio()
  for(i <- 16 to 41)
  {
    audio.playTone(i, 1000)
  }
  keys.waitForAnyPress
}

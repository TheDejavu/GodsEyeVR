# GodsEyeVR
Makes GodsEye ignore VR players
```java
public void onGodsEyeBypassEvent(GodsEyeVRBypassEvent event){
  Player player = event.getPlayer();
  player.sendMessage("Hello VR player");
  event.setCancelled(true/false)
}
```

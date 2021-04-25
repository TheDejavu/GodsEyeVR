# GodsEyeVR
Makes GodsEye ignore VR players
# Dependencies
https://github.com/jrbudda/Vivecraft_Spigot_Extensions
# API
```java
public void onGodsEyeBypassEvent(GodsEyeVRBypassEvent event){
  Player player = event.getPlayer();
  player.sendMessage("Hello VR player");
  event.setCancelled(true/false)
}
```

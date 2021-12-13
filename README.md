# ActionBarTitleUtils
Send action bar and title messages very easy.

# How to use it in your project?
1. Select `general_classes` or `reduced_classes`. There are technically the same, the only difference between them are the organization of the methods.
2. Add all the classes of your selected package into your own package or directly into your project.
3. Call a new instance of the `Initializer` class into your main class or another class you want to initialize those classes.
```java
Initializer init = new Initializer();
Player player = Bukkit.getPlayer(name);
```
4. Call the methods:
```java
init.sendActionBar(player, "A cool message lol");
init.sendTitleSubtitle(player, "This title", "is so sick!", 10, 60, 20);
```

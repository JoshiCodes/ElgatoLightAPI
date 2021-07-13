# ElgatoLightAPI
Simple Java API for the Elgato Lights
<p align="center">
        <a href="https://discord.gg/WGAh3MJ" alt="Discord"><img src="https://img.shields.io/discord/752831569772675072" /></a>
        <a alt="Language: Java"><img src="https://img.shields.io/github/languages/top/joshicodes/telegrambotapi" /></a>
        <a alt="Version:"><img src="https://img.shields.io/github/v/release/JoshiCodes/ElgatoLightAPI?include_prereleases&label=version"></a>
        <a alt="Download" href="https://github.com/JoshiCodes/ElgatoLightAPI/releases/latest"><img src="https://img.shields.io/github/downloads-pre/JoshiCodes/ElgatoLightAPI/latest/total?color=success&label=Downloads" /></a>
        </p>

# Download

You can Download the API <a href="https://github.com/JoshiCodes/TelegramBotAPI/releases/latest">here</a>. For more Information visit <a href="https://github.com/JoshiCodes/TelegramBotAPI/wiki/Getting-Started#implement-the-bot-api">this page</a>.

## Maven

```pom
<repositories>
    ...
    <repository>
        <id>repo.joshi.codes</id>
        <url>https://repo.joshi.codes</url>
    </repository>
    ...
</repositories>

<dependencies>
    ...
    <dependency>
        <groupId>de.joshizockt</groupId>
        <artifactId>ElgatoLightAPI</artifactId>
        <version>VERSION</version>
    </dependency>
    ...
</dependencies>
```


<br><br>

# Usage

### To use the API, you have to create an `Elgato` Instance first:
```java
Elgato elgato = new Elgato("IpOfYourLight");
```
(You can find the IP of your Light in the Dashboard of your Router.)
<br><br><br>

### To make changes at one or multiple Lights, you need the `LightController`:
```java
LightController controller = elgato.getController();
```
<br>

### To change the Light state of ___all___ your Lights, use the following Method:
```java
controller.setLightState(true); // activate all your lights

controller.setLightState(false); // deactivate all your lights
```

### To change the Color of a Light, use `controller.put(new Light(state, color, brightness))`:
```java
controller.put(new Light(true, Color.GREEN, 100));
```
Alternative you can set the HUE and the SATURATION by itself:
```java
controller.put(new Light(true, HUE, SATURATION, 100));
```

## To use different lights with different IP Addresses, you are required to create a new `Elgato` Instance.
<br><br><br>

# Support and Help

For Support and Help visit my Discord. <br>
[![JoshiZockt.de Discord](https://discord.com/api/guilds/752831569772675072/widget.png?style=banner2)](https://discord.gg/WGAh3MJ)

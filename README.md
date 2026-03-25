# Tiny Bees Mod

A simple, lightweight Fabric mod for Minecraft 26.1 that makes all bees look like tiny baby bees!

## What it does

This mod maintains all the vanilla mechanics of bees. They can still grow up, breed, gather pollen, and produce honey exactly as they do in the base game. 

However, it changes their visual size (and hitbox) so that both **adult** and **baby** bees have a scale of `0.5` (the size of a vanilla baby bee). This gives the game a cuter, more proportionately "vanilla-feeling" aesthetic without the giant default bees taking up so much space.

## Features

- **Aesthetic Only (mostly):** Bees remain fully functional and keep their normal life cycles. Only their physical size is changed.
- **Server-Side Compatible:** This mod dynamically modifies the `Attributes.SCALE` attribute of the bees. Because Minecraft naturally syncs entity attributes from the server to the client, you can install this mod **only on the server**. Players can join with a 100% vanilla client and they will still see the tiny bees perfectly!
- **Performance Friendly:** Uses a simple Mixin on the Bee's `tick` method to ensure the scale is always correct without any performance overhead.

## How it works (Technical Details)

The mod uses Mixins to inject into the `tick()` method of `net.minecraft.world.entity.animal.bee.Bee`. 
Vanilla Minecraft automatically applies a `0.5` multiplier to the scale of baby ageable mobs. To ensure both adults and babies end up at exactly `0.5` scale:
- The mod forces the base `SCALE` attribute of adult bees to `0.5` (Result: `0.5`).
- The mod forces the base `SCALE` attribute of baby bees to `1.0D`, which is then halved by the vanilla baby multiplier (Result: `0.5`).

## Installation

1. Install [Fabric Loader](https://fabricmc.net/) for Minecraft 26.1.
2. Download the `.jar` file of this mod.
3. Drop it into your `.minecraft/mods` or your server's `mods` folder.
4. (Optional but recommended) Install `Fabric API`.

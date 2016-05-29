/*
 * This file ("ContainerSmileyCloud.java") is part of the Actually Additions mod for Minecraft.
 * It is created and owned by Ellpeck and distributed
 * under the Actually Additions License to be found at
 * http://ellpeck.de/actaddlicense
 * View the source code at https://github.com/Ellpeck/ActuallyAdditions
 *
 * © 2015-2016 Ellpeck
 */

package de.ellpeck.actuallyadditions.mod.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;

public class ContainerSmileyCloud extends Container{

    @Override
    public ItemStack transferStackInSlot(EntityPlayer player, int slot){
        return null;
    }

    @Override
    public boolean canInteractWith(EntityPlayer player){
        return true;
    }
}
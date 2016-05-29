/*
 * This file ("ReconstructorRecipeHandler.java") is part of the Actually Additions mod for Minecraft.
 * It is created and owned by Ellpeck and distributed
 * under the Actually Additions License to be found at
 * http://ellpeck.de/actaddlicense
 * View the source code at https://github.com/Ellpeck/ActuallyAdditions
 *
 * © 2015-2016 Ellpeck
 */

package de.ellpeck.actuallyadditions.mod.jei.reconstructor;

import de.ellpeck.actuallyadditions.api.recipe.LensConversionRecipe;
import de.ellpeck.actuallyadditions.mod.nei.NEIReconstructorRecipe;
import mezz.jei.api.recipe.IRecipeHandler;
import mezz.jei.api.recipe.IRecipeWrapper;

import javax.annotation.Nonnull;

public class ReconstructorRecipeHandler implements IRecipeHandler<LensConversionRecipe>{


    @Override
    public Class getRecipeClass(){
        return LensConversionRecipe.class;
    }


    @Override
    public String getRecipeCategoryUid(){
        return NEIReconstructorRecipe.NAME;
    }


    @Override
    public IRecipeWrapper getRecipeWrapper(LensConversionRecipe recipe){
        return new ReconstructorRecipeWrapper(recipe);
    }

    @Override
    public boolean isRecipeValid(LensConversionRecipe recipe){
        return true;
    }
}

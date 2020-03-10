package com.zipcodewilmington.froilansfarm.peopletest;

import com.zipcodewilmington.froilansfarm.farmland.CropRow;
import com.zipcodewilmington.froilansfarm.farmland.Field;
import com.zipcodewilmington.froilansfarm.food.CornStalk;
import com.zipcodewilmington.froilansfarm.food.Egg;
import com.zipcodewilmington.froilansfarm.people.Farmer;
import com.zipcodewilmington.froilansfarm.vehicles.Tractor;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class FarmerTest
{
    String name = "Jeff";
    Farmer test = new Farmer(name);
    Egg harvestedEgg = new Egg();
    Tractor tester = new Tractor();
    Field testField = new Field();

    @Test
    public void TestEggHarvest()
    {
        //Given
        ArrayList<Egg> eggNum = new ArrayList<Egg>();
        test.harvestEgg(eggNum);

        //When
        Boolean expected = eggNum.size() != 0;
        //Then

        Assert.assertTrue(expected);

    }

    @Test
    public void TestMount()
    {
        Farmer riding = new Farmer(name);
        Assert.assertTrue(riding.mount(tester));

    }

    @Test
    public void TestDismount()
    {
        Farmer riding = new Farmer(name);
        riding.mount(tester);
        Assert.assertTrue(riding.dismount(tester));

    }

    @Test
    public void TestPlant()
    {
        Farmer planting = new Farmer(name);
        CornStalk cornStalk = new CornStalk();
        CropRow cropRow = new CropRow();
        testField.addCropRowsToCropField(cropRow);
        Assert.assertEquals(planting.plant(testField.getCropRowsInField().get(0), cornStalk),40);
    }
}

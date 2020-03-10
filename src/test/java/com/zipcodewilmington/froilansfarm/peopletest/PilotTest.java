package com.zipcodewilmington.froilansfarm.peopletest;

import com.zipcodewilmington.froilansfarm.farmland.Field;
import com.zipcodewilmington.froilansfarm.food.Egg;
import com.zipcodewilmington.froilansfarm.people.Farmer;
import com.zipcodewilmington.froilansfarm.people.Pilot;
import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.vehicles.Tractor;
import org.junit.Assert;
import org.junit.Test;

public class PilotTest
{
    String name = "Jeff";
    Pilot test = new Pilot(name);

    Tractor tester = new Tractor();

    @Test
    public void TestMount()
    {
        Pilot riding = new Pilot(name);
        Assert.assertTrue(riding.mount(tester));

    }

    @Test
    public void TestDismount()
    {
        Pilot riding = new Pilot(name);
        riding.mount(tester);
        Assert.assertTrue(riding.dismount(tester));

    }
}

package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.InstrumentationRegistry;

import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.ExecutionException;

import static org.junit.Assert.*;

public class EndPointsAsyncTaskTest {

    @Test
    public void asyncTaskNonEmptyReturn() {
        String result = "";
        Context context = InstrumentationRegistry.getInstrumentation().getTargetContext();
        EndPointsAsyncTask endPointsAsyncTask = new EndPointsAsyncTask();
        endPointsAsyncTask.execute(context);
        try {
            result = endPointsAsyncTask.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        Assert.assertNotEquals("", result);
    }
}
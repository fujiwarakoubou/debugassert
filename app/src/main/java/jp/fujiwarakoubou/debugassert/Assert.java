/*
 * Copyright (c) 2015 Takahito Fujiwara
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */

package jp.fujiwarakoubou.debugassert;

import android.app.Activity;

/**
 * Created by Takahito Fujiwara on 2015/07/23.
 */
public class Assert {
    public static void assertTest(Activity activity, String message) {
        AssertDialog.showDialog(activity, message);
    }
}

/*
 * Copyright 2021 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

package dev.icerock.moko.mvvm.livedata.material

import androidx.lifecycle.LifecycleOwner
import com.google.android.material.textfield.TextInputLayout
import dev.icerock.moko.mvvm.livedata.Closeable
import dev.icerock.moko.mvvm.livedata.LiveData
import dev.icerock.moko.mvvm.utils.bindNotNull
import dev.icerock.moko.resources.desc.StringDesc

@JvmName("bindErrorString")
fun TextInputLayout.bindError(
    lifecycleOwner: LifecycleOwner,
    liveData: LiveData<String>
): Closeable {
    return liveData.bindNotNull(lifecycleOwner) { this.error = it }
}

@JvmName("bindErrorStringDesc")
fun TextInputLayout.bindError(
    lifecycleOwner: LifecycleOwner,
    liveData: LiveData<StringDesc>
): Closeable {
    return liveData.bindNotNull(lifecycleOwner) { this.error = it.toString(this.context) }
}

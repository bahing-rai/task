package com.example.task1.repository

import com.example.task1.model.ProductModel
import com.example.task1.model.UserModel
import javax.security.auth.callback.Callback

interface ProductRepository {

    //    {
//     "success" : true,
//    "message":"product fetched"
//    "product":"{ProductModel}"
//    }
    fun addProduct(
        model: ProductModel,
        callback: (Boolean, String) -> Unit
    )

    fun getProductById(
        productId: String,
        callback: (Boolean, String, ProductModel?) -> Unit
    )

    fun getAllProduct(
        callback: (Boolean, String, List<ProductModel?>) -> Unit
    )

    fun updateProduct(
        productId: String,
        data: MutableMap<String, Any?>,
        callback: (Boolean, String) -> Unit
    )

    fun deleteProduct(
        productId: String,
        callback: (Boolean, String) -> Unit
    )


}
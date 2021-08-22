package com.remidosol.yemeksepeti_graduation_remidosol.ui.home.restaurants.restaurantDetail

import androidx.lifecycle.LiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.remidosol.yemeksepeti_graduation_remidosol.data.ApiRepository
import com.remidosol.yemeksepeti_graduation_remidosol.data.entity.core.Restaurant
import com.remidosol.yemeksepeti_graduation_remidosol.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RestaurantDetailViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    var apiRepository: ApiRepository
) : ViewModel() {

    fun getRestaurant(restaurant_id: Int): LiveData<Resource<Restaurant>> {
        return apiRepository.getRestaurant(restaurant_id)
    }

}
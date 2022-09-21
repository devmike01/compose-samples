/*
 * Copyright 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.jetnews.data.posts

import com.example.jetnews.data.Result
import com.example.jetnews.model.Favorite
import com.example.jetnews.model.Post
import com.example.jetnews.model.PostsFeed
import kotlinx.coroutines.flow.Flow

/**
 * Interface to the Posts data layer.
 */
interface PostsRepository {

    /**
     * Get a specific JetNews post.
     */
    suspend fun getPost(postId: String?): Result<Post>

    /**
     * Get JetNews posts.
     */
    suspend fun getPostsFeed(): Result<PostsFeed>

    /**
     * Observe the current favorites
     */
    suspend fun observeToggleFavorites(): Flow<Set<String>>


    /**
     * Observe the current favorites
     */
    fun observeFavorites(): Flow<Set<String>>

    /**
     * Toggle a postId to be a favorite or not.
     */
    suspend fun toggleFavorite(postId: String)

    /**
     * Toggle a postId to be a favorite or not.
     */
    @Deprecated("Use new function")
    suspend fun toggleFavorite(favorite: Favorite)

    /**
     * Get all id of favorites
     */
    suspend fun getFavorites(): Set<String>



    //   favoriteDb.collectFavorites().flowOn(Dispatchers.IO).collectLatest {
    //            Log.d("observeFavorites", "observeFavorites --> $it")
    //            favorites.value = it.map { fav -> fav.id }.toSet()
    //        }
    //        return favorites
}

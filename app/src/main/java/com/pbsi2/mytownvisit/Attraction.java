/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.pbsi2.mytownvisit;

/**
 * {@link Attraction} represents a vocabulary word that the user wants to learn.
 * It contains resource IDs for the default translation, Miwok translation, audio file, and
 * optional image file for that word.
 */
public class Attraction {

    /** String resource ID for the default translation of the word */
    private int itemNameId;

    /** String resource ID for the Miwok translation of the word */
    private int itemDescriptionId;

    /** Audio resource ID for the word */
    private int itemAddressId;

    /** Image resource ID for the word */
    private int itemImageId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Word object.
     *
     * @param itemName is the string resource ID for the attraction's name
     * @param itemDescription is the string resource Id for the attraction description
     * @param itemAddress is the address of the place, location
     */
    public Attraction(int itemName, int itemAddress, int itemDescription, int itemImage) {
        itemNameId = itemName;
        itemDescriptionId = itemDescription;
        itemAddressId = itemAddress;
        itemImageId = itemImage;
    }



    /**
     * Get the string resource ID for the default translation of the word.
     */
    public int getitemName() {
        return itemNameId;
    }

    /**
     * Get the string resource ID for the Miwok translation of the word.
     */
    public int getitemDescription() {
        return itemDescriptionId;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return itemImageId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return itemImageId != NO_IMAGE_PROVIDED;
    }

    /**
     * Return the audio resource ID of the word.
     */
    public int getitemAddress() {
        return itemAddressId;
    }
}
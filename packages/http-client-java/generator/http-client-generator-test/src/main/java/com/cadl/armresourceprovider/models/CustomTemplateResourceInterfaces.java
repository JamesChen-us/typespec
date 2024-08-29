// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.armresourceprovider.models;

/**
 * Resource collection API of CustomTemplateResourceInterfaces.
 */
public interface CustomTemplateResourceInterfaces {
    /**
     * Begins definition for a new CustomTemplateResource resource.
     * 
     * @param name resource name.
     * @return the first stage of the new CustomTemplateResource definition.
     */
    CustomTemplateResource.DefinitionStages.Blank define(String name);
}
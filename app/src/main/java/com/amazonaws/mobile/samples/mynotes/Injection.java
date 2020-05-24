/*
Copyright 2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.

Permission is hereby granted, free of charge, to any person obtaining a copy of this
software and associated documentation files (the "Software"), to deal in the Software
without restriction, including without limitation the rights to use, copy, modify,
merge, publish, distribute, sublicense, and/or sell copies of the Software, and to
permit persons to whom the Software is furnished to do so.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.amazonaws.mobile.samples.mynotes;

import android.content.Context;

import com.amazonaws.mobile.samples.mynotes.repository.NotesRepository;
import com.amazonaws.mobile.samples.mynotes.services.AnalyticsService;
import com.amazonaws.mobile.samples.mynotes.services.DataService;
import com.amazonaws.mobile.samples.mynotes.services.aws.AWSAnalyticsService;
import com.amazonaws.mobile.samples.mynotes.services.aws.AWSDataService;
import com.amazonaws.mobile.samples.mynotes.services.aws.AWSService;
import com.amazonaws.mobile.samples.mynotes.services.mock.MockAnalyticsService;
import com.amazonaws.mobile.samples.mynotes.services.mock.MockDataService;

/**
 * This is a "fake" dependency injection system.
 */
public class Injection {
    private static DataService dataService = null;
    private static AnalyticsService analyticsService = null;
    private static NotesRepository notesRepository = null;

    public static synchronized DataService getDataService() {
        return dataService;
    }

    public static synchronized AnalyticsService getAnalyticsService() {
        return analyticsService;
    }

    public static synchronized NotesRepository getNotesRepository() {
        return notesRepository;
    }

    private static AWSService awsService = null;

    public static synchronized AWSService getAWSService() {
        return awsService;
    }

    public static synchronized void initialize(Context context) {
        if (awsService == null) {
            awsService = new AWSService(context);
        }

        if (analyticsService == null) {
            analyticsService = new AWSAnalyticsService(context, awsService);
        }

        if (dataService == null) {
            dataService = new AWSDataService(context, awsService);
        }

        if (notesRepository == null) {
            notesRepository = new NotesRepository(dataService);
        }
    }
}

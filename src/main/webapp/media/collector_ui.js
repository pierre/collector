/*
 * Copyright 2010-2011 Ning, Inc.
 *
 * Ning licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

var lastupdate = 0;

/**
 * Function called by the Atmosphere plug-in after an update cycle
 */
function callback(response)
{
    // If no response is given, return 404 error and no information
    if (response === null || response === undefined) {
        response = function()
        {
            this.status = 404;
            this.responseBody = "";
        };
    }

    // Update the 'Last Update...' header
    updateStatus(response.status);

    // Log response
    $.atmosphere.log('debug', ["response.status: " + response.status]);

    if (response.status != 200) {
        return;
    }

    var data = response.responseBody;
    if (data.length <= 0) {
        $.atmosphere.log('info', ["No data received from server"]);
        return;
    }

    $.atmosphere.log('debug', ["event: " + data]);
    $('#events > tbody:first').prepend("<tr><td>" + data + "</td><td>" + getTimeAsString() + "</td></tr>");

    // Keep at most 100 events in the browser
    if ($('#events tbody tr').size() > 100) {
        $('#events > tbody tr:last').remove();
    }
}

/**
 * Update the header of the page to give stats about the live feed
 */
function updateStatus(code)
{
    lastupdate = 0;

    $('h1#status_update #status').each(function()
    {
        var elem = $(this);
        elem.text("Last Update " + getTimeAsString() + ". Status code was: " + code);
    });
}

/**
 * Return the current timestamp as a human readable string
 */
function getTimeAsString()
{
    var d = new Date();

    var d_hour = d.getHours();

    var d_min = d.getMinutes() + "";
    if (d_min.length == 1) {
        d_min = "0" + d_min;
    }

    var d_sec = d.getSeconds() + "";
    if (d_sec.length == 1) {
        d_sec = "0" + d_sec;
    }

    return d_hour + ":" + d_min + ":" + d_sec;
}

/**
 * Update the __s ago status
 */
function timer()
{
    window.setTimeout("timer()", 1000);
    lastupdate++;

    var lastupdateString;
    if (lastupdate < 60) {
        lastupdateString = lastupdate + ' s';
    }
    else {
        lastupdateString = Math.floor(lastupdate / 60) + ' min ' + (lastupdate % 60) + ' s';
    }

    $('h1#status_update #lastupdate').text(' (' + lastupdateString + ' ago)')
}

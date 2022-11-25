package com.hemebiotech.analytics;

/**
 * Write symptoms data from a source to a file
 *
 * Create the file if not exits or overwrite it.
 */
public interface ISymptomWriter {
    /**
     * Write the result in output system (file, BDD.....)
     */
    void writeSymptoms ();
}

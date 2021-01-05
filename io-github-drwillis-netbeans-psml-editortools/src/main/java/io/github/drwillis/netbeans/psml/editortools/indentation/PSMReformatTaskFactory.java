/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.drwillis.netbeans.psml.editortools.indentation;

import org.netbeans.modules.editor.indent.spi.Context;
import org.netbeans.modules.editor.indent.spi.ReformatTask;

/**
 *
 * @author arwillis
 */
public class PSMReformatTaskFactory implements ReformatTask.Factory {

    @Override
    public ReformatTask createTask(Context context) {
        return new PSMReformatTask(context);
    }
}

/*
 * Copyright (c) 2013-2014, Neuro4j
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

package org.neuro4j.workflow.loader;

import org.neuro4j.workflow.ExecutableEntityFactory;
import org.neuro4j.workflow.common.FlowInitializationException;
import org.neuro4j.workflow.node.CustomBlock;
import org.neuro4j.workflow.node.CustomNode;

public class LogicBlockLoader {

    private static LogicBlockLoader INSTANCE = new LogicBlockLoader();

    private LogicBlockLoader() {
        super();
    }

    public static LogicBlockLoader getInstance() {
        return INSTANCE;
    }

    public CustomBlock lookupBlock(CustomNode entity) throws FlowInitializationException
    {
        CustomBlock block = (CustomBlock) ExecutableEntityFactory.getActionEntity(entity);
        block.init();
        return block;
    }
}

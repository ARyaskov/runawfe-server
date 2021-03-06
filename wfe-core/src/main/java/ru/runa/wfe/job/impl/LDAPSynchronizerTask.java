package ru.runa.wfe.job.impl;

import ru.runa.wfe.security.logic.LDAPLogic;

public class LDAPSynchronizerTask extends JobTask<LDAPLogic> {

    @Override
    protected void execute() throws Exception {
        getTransactionalExecutor().synchronizeExecutors(true, false);
    }

}

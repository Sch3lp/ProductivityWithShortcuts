package be.swsb.productivity.chapter7;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

import java.util.List;

class War {
    private Joiner joiner = Joiner.on(" ");
    private List<String> quoteWords = Lists.newArrayList();

    public War() {
        System.out.println(war().war().never().changes().quote());
    }

    private String quote() {
        return joiner.join(quoteWords);
    }

    private War war() {
        if (quoteWords.isEmpty()){
            quoteWords.add("War...");
        } else {
            quoteWords.add("War");
        }
        return this;
    }

    private War never() {
        quoteWords.add("never");
        return this;
    }

    private War changes() {
        quoteWords.add("changes");
        return this;
    }
}

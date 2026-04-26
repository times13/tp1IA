package ht.fds.mbds.alfred.llm;

public record LlmInteraction(
        String questionJson,
        String reponseJson,
        String reponseExtraite
) {}
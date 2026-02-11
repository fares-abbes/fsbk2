package org.example.backendtest.service;

import org.example.backendtest.dto.TpRecord;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TpParseService {

    private final Map<String, List<TpRecord>> results = new HashMap<>();

    public void addRecord(String jobId, TpRecord record) {
        results.computeIfAbsent(jobId, k -> new ArrayList<>()).add(record);
    }

    public List<TpRecord> getResults(String jobId) {
        return results.getOrDefault(jobId, new ArrayList<>());
    }

    public void clearResults(String jobId) {
        results.remove(jobId);
    }
}
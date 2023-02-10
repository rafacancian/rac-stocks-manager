package com.racstockmanager.b3.core.repository.fii;

import com.racstockmanager.b3.core.model.fii.Fii;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class FiiRepository {

    public Set<Fii> getAll() {
        return FiiRepositoryData.getAll();
    }
}

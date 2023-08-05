package com.racstockmanager.b3.core.lockprocess;

import org.springframework.stereotype.Service;

@Service
public class Locker {

    private boolean isLocked = false;

    public synchronized void lock() throws InterruptedException {
        while (isLocked) {
            wait(); // Aguarda até que o lock esteja liberado
        }
        isLocked = true;
    }

    public synchronized void unlock() {
        isLocked = false;
        notify(); // Notifica outros threads que estavam esperando para que possam tentar adquirir o lock
    }
}






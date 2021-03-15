package com.github.anikos.hollandkocsma.entityforsend;

import lombok.AllArgsConstructor;
import java.util.List;

@AllArgsConstructor
public class GameState {
    public int gameId;
    public PlayersData playersData;
    public MachinesData machinesData;
    public TablesData tablesData;
    public boolean isTurnFinished;
    public boolean isBurned;
    public List<Integer> selectedIds;
    public boolean isFromBlind;
}

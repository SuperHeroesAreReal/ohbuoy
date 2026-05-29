# OhBuoy V0

![OhBuoy - stack trace ocean](assets/ohbuoy-stack-trace-ocean.png)

OhBuoy is a lightweight operational orientation instrument.

It is not observability tooling, telemetry, distributed tracing, dashboards, AI orchestration, network surveillance, or infrastructure crawling.

Audits tell you what exists. OhBuoy tells you what happens along declared terrain.

Core loop:

```text
scan
packet
render
release
```

V0 doctrine:

```text
ping before ponder
no answer is an answer
minimal memory is sacred
the scanner must float above terrain, not become the terrain
```

---

## Use

Build the local CLI package:

```powershell
.\gradlew.bat :cli:installDist
```

Run the scanner:

```powershell
.\cli\build\install\ohbuoy\bin\ohbuoy.bat startup
```

Equivalent scan form:

```powershell
.\cli\build\install\ohbuoy\bin\ohbuoy.bat scan startup
```

Run the AIluminode EEG orientation instrument:

```powershell
.\cli\build\install\ohbuoy\bin\ohbuoy.bat eeg "Refactor Paula EPUB source handling without touching memory save logic"
```

---

## Orientation Stack

```text
OhBuoy      = continuity instrument
Compass     = bearing instrument
RECCE       = reconnaissance instrument
Plotter     = position instrument
AIluminode  = cognitive orientation instrument
EEG         = internal AIluminode scan mode for contextual posture
```

Compass determines corridor truth.

AIluminode determines cognitive and retrieval posture.

Instrument questions:

```text
OhBuoy     -> Is the route alive?
RECCE      -> What is actually out there?
Compass    -> Which way should I face?
Plotter    -> Where am I?
AIluminode -> How should I proceed?
```

Glass Stack doctrine:

```text
No pane owns the terrain.
No pane owns another pane.
Use the smallest set of panes needed before action.
```

EEG is the first AIluminode mode. It asks:

```text
What terrain am I allowed to enter?
What terrain should I avoid?
What terrain should I protect?
```

Route polarity is a corridor, not a blindfold.

The scanner is operationally blinkered but architecturally peripheral-aware: it narrows action to declared terrain while still allowing side-door observations to be reported as evidence.

Blocked terrain prevents implementation drift. It does not erase architectural awareness.

Stable corridors need lighter orientation overhead. Uncertain, dark, or stale terrain should trigger a fresh Compass and EEG check before retrieval or action.

```text
if terrain feels stale
→ ping orientation again
→ refresh route polarity
→ act only inside the updated corridor
```

---

## Expected V0 Terrain

```text
TRACE startup_4812

AUTH ✓
TENANT ✓
GOVERNANCE ⚠
NAVIGATION ⛔

HOWLER:
Governance degradation propagated downstream.
```

Available modes:

```text
startup
login
governance
navigation
```

AIluminode EEG emits a compact contextual posture trace:

```text
EEG TRACE eeg_1234

ACTIVE_TERRAIN:
- paula_memory_pipeline
- source_terrain
- codebase

STANCE:
surgical_refactor

COMPASS_GUIDANCE:
- route=paula_memory_pipeline
- howler=RECENT_SQLITE_MEMORY bypasses STANCE_GATE and TERRAIN_GATE.
- likely_fix=Move recent memory retrieval behind topology filtering.

ROUTE_POLARITY:
- OPEN: current_prompt (declared task is the active entry point)
- OPEN: bounded_source_index (source terrain is active; use bounded source access)
- PROTECT: saved_memory (saved_memory is named under a protection/avoidance phrase)
- AUDIT: compass:prompt_assembly (Compass target for observed propagation drift)
- DEFER: vector_memory (vector_memory is not needed for this task)
- BLOCK: autonomous_crawling (EEG V1 stays declared-terrain only)

OPEN_ROUTES:
- current_prompt
- paula_memory_files
- bounded_source_index
- declared_code_surface

PROTECT:
- saved_memory

AUDIT:
- compass:prompt_assembly

DEFER:
- archive_logs
- vector_memory
- full_source_ingestion
- dashboard

BLOCK:
- autonomous_crawling
- telemetry_empire

DRIFT_RISK:
- source_terrain_mistaken_for_memory

NEXT_SAFE_ACTION:
Protect saved memory; inspect adjacent route logic without modifying it.
```

---

## V2 Compass

Compass compares declared propagation routes.

It does not inspect projects, crawl repositories, chase runtime links, or decide terrain vocabulary. The route must be declared first.

Run the Paula memory pipeline report:

```powershell
.\cli\build\install\ohbuoy\bin\ohbuoy.bat compass paula_memory_pipeline
```

Expected shape:

```text
COMPASS REPORT paula_memory_pipeline

EXPECTED:
USER_INPUT
→ STANCE_GATE
→ TERRAIN_GATE
→ BLOCKERS/SIGNPOSTS
→ FILTERED_RECENT_MEMORY
→ BOUNDED_RETRIEVAL
→ TOPOGRAPHY_PACKET
→ MODEL_PROMPT
→ MODEL_RESPONSE
→ SQLITE_MEMORY_WRITE

OBSERVED:
USER_INPUT
→ TOPOGRAPHY_PACKET
→ RECENT_SQLITE_MEMORY
→ MODEL_PROMPT
→ MODEL_RESPONSE
→ SQLITE_MEMORY_WRITE

HOWLER:
RECENT_SQLITE_MEMORY bypasses STANCE_GATE and TERRAIN_GATE.
```

---

## Boundaries

OhBuoy observes declared terrain only.

It must never become an autonomous topology crawler. It does not chase unknown links, discover infrastructure, retain operational data, ingest telemetry, or build dashboards.

The scanner emits bounded continuity packets, renders operational orientation, and releases the data.

AIluminode follows the same boundary. EEG observes contextual posture before action; it does not read files, retain prompts, retrieve memory, or modify terrain.

Side-door observations may inform a report, but they do not grant permission to widen the implementation route.

Dynamic re-orientation is preferred over stretching an old packet across changed terrain.

Unknown terrain is a first-class state:

```text
unknownTerrain
-> route not registered
-> position uncertain
-> bearing unavailable
-> stop propagation
-> report state
```

---

## RECCE

RECCE is the field discipline around OhBuoy.

```text
observe
orient
report
disappear
```

Scouts do not start building towers because the view is nice.

RECCE marks continuity fracture zones without fixing, rewriting, or occupying terrain.

Run RECCE doctrine tests:

```powershell
.\gradlew.bat :core:test
```

---

## Current Shape

```text
ohbuoy = observes terrain
Compass = compares expected and observed propagation
RECCE = proves field discipline
Plotter = position instrument
AIluminode = public cognitive orientation instrument
EEG = internal AIluminode scan mode for route polarity
larger package = remembers/signposts terrain
```

Markers, memory signposts, and durable topology annotations belong in a larger cognition layer, not in the scanner.

---

## Related Tool

AIluminode is the standalone cognitive-orientation companion to OhBuoy.

- OhBuoy handles operational and topological orientation.
- Compass compares expected and observed propagation.
- AIluminode handles cognitive posture, route polarity, and posture-before-action discipline.

Together they support orientation-first systems work without becoming telemetry, memory ownership, or autonomous orchestration.

---

## Keywords

continuity tracing, operational topology, system propagation, runtime continuity, auth drift, topology mapping, trace analysis, operational GIS, fracture detection, startup sequencing, navigation continuity, systems topography, orientation-first systems, cognitive orientation, posture-before-action, cognitive posture, route polarity, bounded retrieval, contextual routing, drift reduction, retrieval discipline, terrain-aware systems, unknownTerrain

---

![NodAIity Logo](assets/NodAIity-logo.png)

```text
Good luck sailor.
```

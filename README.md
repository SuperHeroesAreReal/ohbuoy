# OhBuoy V0

![OhBuoy - stack trace ocean](assets/ohbuoy-stack-trace-ocean.png)

OhBuoy is a lightweight operational orientation instrument.

It is not observability tooling, telemetry, distributed tracing, dashboards, AI orchestration, network surveillance, or infrastructure crawling.

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
RECCE = proves field discipline
larger package = remembers/signposts terrain
```

Markers, memory signposts, and durable topology annotations belong in a larger cognition layer, not in the scanner.

---

## Keywords

continuity tracing, operational topology, system propagation, runtime continuity, auth drift, topology mapping, trace analysis, operational GIS, fracture detection, startup sequencing, navigation continuity, systems topography

---

![NodAIity Logo](assets/NodAIity-logo.png)

```text
Good luck sailor.
```
